package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class JDBCUtil {
    private static SessionFactory sf;
    static{
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .configure()
                        .build();
        sf = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sf;
    }
}
