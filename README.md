[![Build Status](https://travis-ci.com/aprabhat/micronaut-restful-sample.svg?branch=master)](https://travis-ci.com/aprabhat/micronaut-restful-sample)

## Feature http-client documentation

- [Micronaut Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature jax-rs documentation

- [Micronaut JAX-RS support documentation](https://micronaut-projects.github.io/micronaut-jaxrs/latest/guide/index.html)

## Feature micronaut hibernate configuration documentation
- [Micronaut Configuring Hibernate](https://docs.micronaut.io/latest/guide/index.html#hibernateSupport)


Command to create docker image with tag

```docker build -t aprabhat/micronaut-restful-sample:v1.0 .```

command to run the docker image

```docker run -d -p 8080:8080 aprabhat/micronaut-restful-sample:v1.0```

To run this application using k8s, setup a local development environment by following the steps available at k8s official site

https://kubernetes.io/docs/tasks/tools/

Here we are using minikube to run a single node k8s cluster on local machine

```minikube version: v1.15.1```

Steps to follow
1. Run the below command to start a single node k8s cluster

      ```minikube start```

2. Open a termical in the project working directory and run

      ```kubectl apply -f deployment```

This will create a deployment and service object in kubernetes. You can modify the configuration related to replicas, memory and cpu in [micronaut-restful-sample-deployment.yml](deployment/micronaut-restful-sample-deployment.yml) file.

3. Now run the below command to return and opn the kubernetes URL for the service in your local cluster.

      ```minikube service micronaut-restful-sample-service```
