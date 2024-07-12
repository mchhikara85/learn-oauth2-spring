# learn SSO oAuth 2 using keycloak

1) Run keycloak using docker image at port 8091
   docker run -p 8091:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:latest start-dev
