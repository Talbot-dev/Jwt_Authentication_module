# JWT Auth Module

A reusable authentication and authorization module for Spring Boot applications using JWT, OAuth2, and Keycloak as the Identity Provider (IdP).

This project demonstrates how to secure REST APIs using Spring Security by validating JWT tokens issued by Keycloak. It provides a clean and modular security configuration that can be integrated into larger backend systems or microservice architectures.

---

## Overview

Modern backend systems often delegate authentication to a centralized identity provider. In this architecture:

- Keycloak handles user authentication, identity management, and token issuance.
- OAuth2 / OpenID Connect defines the authorization flow.
- Spring Security validates the JWT token on each request and protects the API endpoints.

This module acts as the security layer that connects a Spring Boot application with a Keycloak authentication server.

---

## Features

- JWT-based authentication
- Integration with Keycloak
- OAuth2 / OpenID Connect support
- Stateless security configuration
- Role-based access control
- Secure REST API endpoints
- Easily extensible security configuration

---

## Tech Stack

- Java
- Spring Boot
- Spring Security
- OAuth2 / OpenID Connect
- Keycloak
- JWT

---

## Authentication Flow

1. The user authenticates with Keycloak.
2. Keycloak verifies the credentials.
3. Keycloak generates a JWT access token.
4. The client sends requests to the API including the token in the Authorization header.
5. Spring Security validates the token.
6. Access to endpoints is granted or denied depending on the user's roles.

User → Keycloak → JWT Token  
Client → API (Authorization: Bearer <token>)  
API → Spring Security validates token → Access granted/denied

---

## Authorization Header Example

Every secured request must include the access token:

Authorization: Bearer <access_token>

---

## Use Cases

This module can be used as a base for:

- Securing REST APIs
- Authentication in microservices architectures
- Backend services requiring centralized identity management
- Systems implementing single sign-on (SSO)

---
