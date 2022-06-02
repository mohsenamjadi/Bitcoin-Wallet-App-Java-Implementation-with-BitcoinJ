# Bitcoin Wallet Application

This is an Implementation of a simple BTC wallet for handling transactions of another application. It uses bitcoinj that is a library for working with the Bitcoin protocol. It can maintain a wallet, send/receive transactions without needing a local copy of Bitcoin Core. Bitcoinj uses SPV mode (lightweight simplified payment verification). In this mode, only a small part of the block chain is downloaded, making bitcoinj suitable for usage on constrained devices like smartphones.

for runnig the application you need to complete application.properties with your specific.
 
 ### After blockchain downloaded completely:
 
 ![image](https://user-images.githubusercontent.com/70103439/171608854-66f33eea-27f7-4091-bf04-146a4010747a.png)

### The application provides your wallet address:

![image](https://user-images.githubusercontent.com/70103439/171615794-9f655c77-4beb-469e-be1a-6343f4e12d69.png)


### you could use the get balance API to findout your balance:

![image](https://user-images.githubusercontent.com/70103439/171608649-7c736b8c-f4ce-4ab9-9acf-eaa27817dd32.png)

### Send coins to any BTC address with send coin API:

![image](https://user-images.githubusercontent.com/70103439/171621491-bd1bb5f3-684d-4595-9eff-df563b7b5767.png)
