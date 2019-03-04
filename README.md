# Feign Hystrix

### Build docker image

`mvn compile jib:dockerBuild`

### Build Chart

`mvn clean compile verify fabric8:resource fabric8:helm`

### Deploy Kubernetes

`mvn fabric8:deploy`

### Deploy using Helm

`helm upgrade --install feign-hystrix target/fabric8/helm/kubernetes/feign-hystrix/`

### Undeploy

`mvn fabric8:undeploy`