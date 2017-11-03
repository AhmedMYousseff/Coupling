package io.study.client;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = getSessionFactory();
	private static StandardServiceRegistry registry;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				
			
				registry = new StandardServiceRegistryBuilder().configure().build();
				//Locate the cfg file
				
				
				// create metaData

				MetadataSources sources = new MetadataSources(registry);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();

			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
		  	}
			}
		}
		return sessionFactory;
	}

	public static void closeSession() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
