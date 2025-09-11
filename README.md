# Introduction

The LLM-generated Java code and unit tests based on the proposed dataset for evaluating LLMs generated code, developed for "Security and Quality in LLM-Generated Code: A Multi-Language, Multi-Model Analysis" research paper.

---

## Prerequisites

Before running the project and SonarQube scan, make sure the following are installed:

- [Java 21+](https://adoptopenjdk.net/)
- [Gradle](https://gradle.org/install/) (or use the included wrapper `./gradlew`)
- [SonarQube Scanner](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/)

---

## Build, Test, and Analyze

Run tests, generate a Jacoco coverage report, and run SonarQube scan:

```bash
./gradlew test jacocoTestReport --continue --stacktrace
sonar-scanner.bat -D"sonar.organization=mohkharma"
