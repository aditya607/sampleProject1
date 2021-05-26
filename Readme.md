1. create a project with gradle and java

2. add dropwizard-core dependency in build file

3. create a config.yaml / config.yml file . (with has server - applicationConnectors )

4. create a) config class implementing configuration 
                b) create main application class extending that application class 
 
5. add application in id in build file , under application task - setMainClassName 

6. add run args in build file 

7. you can create an resource class , and add that class to environment.jersy.
   - run it will work fine

8. apply shadow plugin , overwrite shadowJar task with exclude 'META-INF' and other files. and add mergeServiceFiles()
   - now run executable jar with java -jar file server config.yaml.

now docker 

9. first of create a docker file. [from java, copy config and jar in workdir, expose the port and cmd].

10. do docker build and run the docker image , it should run fine.

11. build docker-compose.yml file . [include redis as service , as web as service whose build: . , will run redis and image created by Dockerfile]
