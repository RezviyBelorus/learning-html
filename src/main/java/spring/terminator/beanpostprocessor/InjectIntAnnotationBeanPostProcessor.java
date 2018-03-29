package spring.terminator.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;
import spring.terminator.annotation.InjectInt;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

public class InjectIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        Random random = new Random();
        Field[] fields = bean.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            InjectInt annotation = field.getAnnotation(InjectInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int repeat = min + random.nextInt(max - min);
                field.setAccessible(true);

                ReflectionUtils.setField(field, bean, repeat);
            }
        });
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }
}
