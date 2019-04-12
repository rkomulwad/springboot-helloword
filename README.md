# Springboot + Docker + Helm + Kubernetes + Istio

This sample project demonstrates
1. Springboot application that exposes JPA data with REST
2. Package the application in a Docker image
3. Deploy the Docker image using Helm into Kubernetes
4. Health check when mTLS enabled

This project requires Kubernetes, Istio with Helm installed and the Bookinfo application deployed. 

[Instructions to install Istio using Helm](https://istio.io/docs/setup/kubernetes/install/helm/)

> Istio should be configured with mTLS, use the "demo-auth" setup mode

[Instructions to deploy the Bookinfo application](https://istio.io/docs/examples/bookinfo/)

> Follow the mTLS instructions

## Compile
```
mvnw clean package
```
 
## Build Docker Image
 ```
docker build -t springboot-helloworld .
```

## Deploy the application using helm
```
helm install --name springboot-helloworld --set image.repository=springboot-helloworld,image.tag=latest ./charts/springboot-helloworld
```

## Access the application
http://localhost/hello/

## Undeploy and cleanup
```
helm del --purge springboot-helloworld
```


