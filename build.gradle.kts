import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.3.72"
}

group = "co.excentri"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
	implementation("io.appium:java-client:7.3.0")
	testImplementation("org.testng:testng:7.1.0")
	testImplementation("org.assertj:assertj-core:3.16.1")
}

tasks.withType<Test> {
	useTestNG()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
