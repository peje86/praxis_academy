pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ ./mvnw spring-boot:run 
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
  symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
  symbol:   class RequestParam
  location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
  symbol:   class GetMapping
  location: class com.example.demo.DemoApplication
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.439 s
[INFO] Finished at: 2020-12-16T17:14:03+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
[ERROR]   symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
[ERROR]   symbol:   class RequestParam
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
[ERROR]   symbol:   class GetMapping
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
bash: mvn: command not found
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn --version
bash: mvn: command not found
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ sudo apt install maven
[sudo] password for pujiono: 
Reading package lists... Done
Building dependency tree       
Reading state information... Done
The following packages were automatically installed and are no longer required:
  bnd java-wrappers libcommons-codec-java libcommons-collections3-java libcommons-compress-java
  libcommons-lang-java libdd-plist-java libfelix-framework-java libfelix-gogo-runtime-java
  libfelix-resolver-java libfindbugs-java libgoogle-gson-java libgradle-core-java libgradle-plugins-java
  libhttpclient-java libhttpcore-java libjarjar-java libjatl-java libjavaewah-java libjcifs-java
  libjcip-annotations-java libjformatstring-java libjgit-java libjna-java libjna-jni libjs-jquery
  libjsoup-java libkryo-java libminlog-java libnative-platform-java libnative-platform-jni libnekohtml-java
  libobjenesis-java libosgi-annotation-java libosgi-compendium-java libosgi-core-java
  libplexus-container-default-java libplexus-container-default1.5-java libpolyglot-maven-java
  libreflectasm-java librhino-java libsimple-http-java libwagon-http-java libxbean-reflect-java
  libxerces2-java libxml-commons-external-java
Use 'sudo apt autoremove' to remove them.
The following additional packages will be installed:
  libwagon-http-shaded-java
The following NEW packages will be installed:
  libwagon-http-shaded-java maven
0 upgraded, 2 newly installed, 0 to remove and 145 not upgraded.
Need to get 1,851 kB of archives.
After this operation, 2,304 kB of additional disk space will be used.
Do you want to continue? [Y/n] Y
Get:1 http://deb.debian.org/debian buster/main amd64 libwagon-http-shaded-java all 3.3.1-2 [1,829 kB]
Get:2 http://deb.debian.org/debian buster/main amd64 maven all 3.6.0-1 [22.1 kB]
Fetched 1,851 kB in 5s (366 kB/s)
Selecting previously unselected package libwagon-http-shaded-java.
(Reading database ... 354497 files and directories currently installed.)
Preparing to unpack .../libwagon-http-shaded-java_3.3.1-2_all.deb ...
Unpacking libwagon-http-shaded-java (3.3.1-2) ...
Selecting previously unselected package maven.
Preparing to unpack .../archives/maven_3.6.0-1_all.deb ...
Unpacking maven (3.6.0-1) ...
Setting up libwagon-http-shaded-java (3.3.1-2) ...
Setting up maven (3.6.0-1) ...
update-alternatives: using /usr/share/maven/bin/mvn to provide /usr/bin/mvn (mvn) in auto mode
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
  symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
  symbol:   class RequestParam
  location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
  symbol:   class GetMapping
  location: class com.example.demo.DemoApplication
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.260 s
[INFO] Finished at: 2020-12-16T17:15:59+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
[ERROR]   symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
[ERROR]   symbol:   class RequestParam
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
[ERROR]   symbol:   class GetMapping
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn -version
Apache Maven 3.6.0
Maven home: /usr/share/maven
Java version: 11.0.9.1, vendor: Debian, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.19.0-10-amd64", arch: "amd64", family: "unix"
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
  symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
  symbol:   class RequestParam
  location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
  symbol:   class GetMapping
  location: class com.example.demo.DemoApplication
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.812 s
[INFO] Finished at: 2020-12-16T17:16:45+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
[ERROR]   symbol: class RestController
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[19,40] cannot find symbol
[ERROR]   symbol:   class RequestParam
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[18,20] cannot find symbol
[ERROR]   symbol:   class GetMapping
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ ls
HELP.md  mvnw  mvnw.cmd  pom.xml  src  target
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
  symbol: class Controller
[INFO] 4 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.988 s
[INFO] Finished at: 2020-12-16T17:19:15+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[10,16] cannot find symbol
[ERROR]   symbol: class Controller
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[INFO] 3 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.984 s
[INFO] Finished at: 2020-12-16T17:19:51+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[5,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[6,61] package org.springframework.web.bind.annotation does not exist
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[7,61] package org.springframework.web.bind.annotation does not exist
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[14,19] cannot find symbol
  symbol:   variable SpringApplication
  location: class com.example.demo.DemoApplication
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.648 s
[INFO] Finished at: 2020-12-16T17:20:59+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[14,19] cannot find symbol
[ERROR]   symbol:   variable SpringApplication
[ERROR]   location: class com.example.demo.DemoApplication
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[9,16] cannot find symbol
  symbol: class SpringBootApplication
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.670 s
[INFO] Finished at: 2020-12-16T17:21:24+07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project demo: Compilation failure
[ERROR] /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/main/java/com/example/demo/DemoApplication.java:[9,16] cannot find symbol
[ERROR]   symbol: class SpringBootApplication
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ mvn spring-boot:run 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.4.1:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/pujiono/Documents/praxis_academy/novice/02-03/demo/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/test-classes
[INFO] 
[INFO] <<< spring-boot-maven-plugin:2.4.1:run (default-cli) < test-compile @ demo <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.4.1:run (default-cli) @ demo ---
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.4.1/spring-boot-buildpack-platform-2.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.4.1/spring-boot-buildpack-platform-2.4.1.pom (3.1 kB at 995 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.3/jackson-databind-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.3/jackson-databind-2.11.3.pom (7.4 kB at 9.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.11.3/jackson-base-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.11.3/jackson-base-2.11.3.pom (7.5 kB at 9.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.3/jackson-annotations-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.3/jackson-annotations-2.11.3.pom (3.8 kB at 4.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.3/jackson-core-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.3/jackson-core-2.11.3.pom (4.9 kB at 6.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.3/jackson-module-parameter-names-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.3/jackson-module-parameter-names-2.11.3.pom (4.0 kB at 5.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.11.3/jackson-modules-java8-2.11.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.11.3/jackson-modules-java8-2.11.3.pom (3.2 kB at 4.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.5.0/jna-platform-5.5.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.5.0/jna-platform-5.5.0.pom (1.8 kB at 2.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.5.0/jna-5.5.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.5.0/jna-5.5.0.pom (1.6 kB at 2.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.20/commons-compress-1.20.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.20/commons-compress-1.20.pom (18 kB at 23 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/48/commons-parent-48.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/48/commons-parent-48.pom (72 kB at 60 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.pom (6.6 kB at 8.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.5.13/httpcomponents-client-4.5.13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.5.13/httpcomponents-client-4.5.13.pom (16 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/11/httpcomponents-parent-11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/11/httpcomponents-parent-11.pom (35 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.pom (5.0 kB at 6.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.13/httpcomponents-core-4.4.13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.13/httpcomponents-core-4.4.13.pom (13 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom (19 kB at 23 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom (56 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.pom (14 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.4.1/spring-boot-loader-tools-2.4.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.4.1/spring-boot-loader-tools-2.4.1.pom (2.3 kB at 2.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom (5.3 kB at 6.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom (5.1 kB at 6.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 1.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (4.2 kB at 5.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom (815 B at 1.1 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom (4.2 kB at 5.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom (17 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom (5.0 kB at 6.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.6.3/maven-plugin-api-3.6.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.6.3/maven-plugin-api-3.6.3.pom (3.0 kB at 3.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.pom (26 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.6.3/maven-model-3.6.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.6.3/maven-model-3.6.3.pom (4.1 kB at 5.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.2.1/plexus-utils-3.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.2.1/plexus-utils-3.2.1.pom (5.3 kB at 6.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.6.3/maven-artifact-3.6.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.6.3/maven-artifact-3.6.3.pom (2.4 kB at 3.1 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.4/org.eclipse.sisu.plexus-0.3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.4/org.eclipse.sisu.plexus-0.3.4.pom (4.2 kB at 5.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.3.4/sisu-plexus-0.3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.3.4/sisu-plexus-0.3.4.pom (14 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.4/org.eclipse.sisu.inject-0.3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.4/org.eclipse.sisu.inject-0.3.4.pom (2.6 kB at 3.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.3.4/sisu-inject-0.3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.3.4/sisu-inject-0.3.4.pom (14 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom (7.3 kB at 9.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.17/plexus-utils-3.0.17.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.17/plexus-utils-3.0.17.pom (3.4 kB at 4.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom (7.9 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.4.1/spring-boot-buildpack-platform-2.4.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.3/jackson-core-2.11.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.3/jackson-annotations-2.11.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.3/jackson-databind-2.11.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.3/jackson-module-parameter-names-2.11.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.3/jackson-module-parameter-names-2.11.3.jar (9.3 kB at 4.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.5.0/jna-platform-5.5.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.4.1/spring-boot-buildpack-platform-2.4.1.jar (202 kB at 95 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.5.0/jna-5.5.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.3/jackson-annotations-2.11.3.jar (68 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.20/commons-compress-1.20.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.3/jackson-core-2.11.3.jar (351 kB at 118 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar (780 kB at 175 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar (329 kB at 61 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar (62 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.jar (335 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.4.1/spring-boot-loader-tools-2.4.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.3/jackson-databind-2.11.3.jar (1.4 MB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.4.1/spring-boot-loader-tools-2.4.1.jar (242 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar (4.2 kB at 465 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.jar (61 kB at 6.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.6.3/maven-plugin-api-3.6.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.6.3/maven-plugin-api-3.6.3.jar (47 kB at 4.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.4/org.eclipse.sisu.plexus-0.3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.jar (164 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.4/org.eclipse.sisu.inject-0.3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.20/commons-compress-1.20.jar (632 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.2.1/plexus-utils-3.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.4/org.eclipse.sisu.inject-0.3.4.jar (379 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.4/org.eclipse.sisu.plexus-0.3.4.jar (205 kB at 18 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.2.1/plexus-utils-3.2.1.jar (262 kB at 20 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.jar (53 kB at 3.9 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.5.0/jna-platform-5.5.0.jar (2.7 MB at 165 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.5.0/jna-5.5.0.jar (1.5 MB at 84 kB/s)
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.1)

2020-12-16 17:23:12.806  INFO 1607 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 11.0.9.1 on pujiono with PID 1607 (/home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes started by pujiono in /home/pujiono/Documents/praxis_academy/novice/02-03/demo)
2020-12-16 17:23:12.810  INFO 1607 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2020-12-16 17:23:13.765  INFO 1607 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 1.804 seconds (JVM running for 2.41)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:03 min
[INFO] Finished at: 2020-12-16T17:23:13+07:00
[INFO] ------------------------------------------------------------------------
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ 