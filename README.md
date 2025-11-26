
Run sonarqube scan

```
./gradlew test jacocoTestReport  --continue --stacktrace

sonar-scanner.bat -D"sonar.organization=mohkharma"
```