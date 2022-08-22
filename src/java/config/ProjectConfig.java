package config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;

@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "JDBC/ohspool",
        callerQuery = "select password from user_master where username = ?",
        groupsQuery = "select groupname from group_master where username = ?",
        hashAlgorithm = Pbkdf2PasswordHash.class,
        priority = 30)

@Named
@ApplicationScoped
public class ProjectConfig {
     public ProjectConfig() {
        System.out.println("Project Config Initialized");
    }
}