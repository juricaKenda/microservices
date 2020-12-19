# Microservices

## Aggregator
Proxies the requests for temperature+humidity measurements. 
### Attributes
- REST API
- Netflix Eureka Client (Registration)
- Cloud Config Client (Configuration)

## Temperature provider
Generates and provides REST API for the temperature measurements. 
### Attributes
- REST API
- Netflix Eureka Client (Registration)
- Cloud Config Client (Configuration)

## Humidity provider
Generates and provides REST API for the humidity measurements. 
### Attributes
- REST API
- Netflix Eureka Client (Registration)
- Cloud Config Client (Configuration)

## Registration server
Enables service registration and discovery within the cluster.
### Attributes
- Netflix Eureka Server

## Config server
Configuration gateway for the config files persisted in the Github repo. 
### Attributes
- Cloud Config Server
