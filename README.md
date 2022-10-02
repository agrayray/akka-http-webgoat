# Akka Http Webgoat

A vulnerable Akka HTTP showcasing potentially vulnerable code patterns.

## Fortify SCA

The `main` branch of the repository configures sbt to translate the code for static analysis by Fortify SCA. The Fortify build ID is set to `akka-http-webgoat` and the SCA version is set to `22.1` in `fortify.sbt`. If you have Fortify SCA on your machine, here are the commands to translate and scan the project:

```
sourceanalyzer -b akka-http-webgoat -clean
sbt clean compile
sourceanalyzer -b akka-http-webgoat -debug -logfile scan.log -scan -f akka-http-webgoat.fpr
```

Once the scan is complete, you can either open the resulting FPR file in Audit Workbench (`auditworkbench akka-http-webgoat.fpr`) or upload it to Fortify SSC Server.

The list of vulnerabilites Fortify finds is in [vulnerabilities.txt](https://github.com/micro-focus/akka-http-webgoat/blob/main/vulnerabilities.txt).


## How To Run

```
# Enter sbt
sbt

# Restart app
reStart
```
