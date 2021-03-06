
plugins {
	id("org.jetbrains.kotlin.jvm") version "1.5.0"
	`java-library`
}

repositories {
	mavenCentral()
}

dependencies {
	// Align versions of all Kotlin components
	implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

	// Use the Kotlin JDK 8 standard library.
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	api(project(":core"))

	// Use the Kotlin test library.
	testImplementation("org.jetbrains.kotlin:kotlin-test")
}
