const { Builder, By, Key, util} = require("selenium-webdriver")
const chrome = require("selenium-webdriver/chrome")

async function saucedemo(){
    
    const service = new chrome.ServiceBuilder('chromedriver.exe')
    let driver = await new Builder().forBrowser('chrome').setChromeService(service).build()

    

    await driver.get('https://www.saucedemo.com/')
    
    await driver.findElement(By.id('user-name')).sendKeys('standard_user')
    await driver.findElement(By.id('password')).sendKeys('secret_sauce', Key.ENTER)
}
saucedemo();