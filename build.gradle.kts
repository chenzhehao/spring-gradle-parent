
plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}

//allprojects {
//    group = "com.chenzhehao.gradle.test"
//    version = "0.0.1-SNAPSHOT"
//}

allprojects {
    repositories {
        mavenCentral() // 共享的仓库
    }
//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter")
//        implementation("org.springframework.boot:spring-boot-starter-web")
//        implementation("com.netflix.graphql.dgs.codegen:graphql-dgs-codegen-gradle:6.2.1")
//        testImplementation("org.springframework.boot:spring-boot-starter-test")
//        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

subprojects {
//    apply(plugins)

    repositories {
        mavenCentral() // 共享的仓库
    }

//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter")
//        implementation("org.springframework.boot:spring-boot-starter-web")
//        testImplementation("org.springframework.boot:spring-boot-starter-test")
//        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//    }
}
//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter")
//        implementation("org.springframework.boot:spring-boot-starter-web")
//        testImplementation("org.springframework.boot:spring-boot-starter-test")
//        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//    }


