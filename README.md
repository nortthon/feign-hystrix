# Feign Hystrix

### Build docker image

`eval $(minikube docker-env)` \
`mvn compile jib:dockerBuild`

### Build Chart

`mvn clean compile verify fabric8:resource fabric8:helm`

### Deploy Kubernetes

`mvn fabric8:deploy`

ou

`helm upgrade --install feign-hystrix target/fabric8/helm/kubernetes/feign-hystrix/`

### Undeploy

`mvn fabric8:undeploy`

ou 

`helm delete feign-hystrix`