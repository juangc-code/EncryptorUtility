# EncryptorUtility
Java CLI for encrypting secrets


## Build
`mvn clean package`

`docker build -t encryptor-utility-cli .`

## Run
`docker run --rm encryptor-utility-cli [jasypt-secret] [your-secret-to-encrypt]`
