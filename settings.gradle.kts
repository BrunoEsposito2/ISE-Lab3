plugins {
    id("com.gradle.enterprise") version "3.13"
}

rootProject.name = "ise-lab-code-perception-actuation"
include("thermostat")

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}
