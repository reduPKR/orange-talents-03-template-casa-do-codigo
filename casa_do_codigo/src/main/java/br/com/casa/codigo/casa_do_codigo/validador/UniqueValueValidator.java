package br.com.casa.codigo.casa_do_codigo.validador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import org.springframework.util.Assert;

public class UniqueValueValidator implements ConstraintValidator<UniqueValue, Object> {

    private String domainAttribute;
    private Class<?> klass;
    @PersistenceContext
    private EntityManager manager;

    @Override
    public void initialize(UniqueValue params) {
        domainAttribute = params.fieldName();
        klass = params.domainClass();
    }


    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Query query = manager.createQuery("select 1 from "+klass.getName()+" where "+domainAttribute+"=:value");
        query.setParameter("value", value);
        List<?> list = query.getResultList();
        Assert.isTrue(list.size() <=1, "Já existe "+klass+" cadastrado");

        if(list.size() >=1)
            throw new ErroNoCadastroException("Este "+domainAttribute+" já foi cadastrado no "+klass.getSimpleName(), domainAttribute+" duplicado");

        return list.isEmpty();
    }


}
