'''
Created on 23-Aug-2021

@author: Ank
'''
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By

browser="chrome"
if(browser=="chrome"):
    driver = webdriver.Chrome(ChromeDriverManager().install())
elif (browser=="firefox"):
    driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
else:
    raise "no browser found"

driver.get("https://www.google.com/") 
driver.implicitly_wait(10)
#wait = WebDriverWait(driver, 10)
driver.maximize_window()
print(driver.title)
driver.find_element(By.NAME,'q').send_keys("Naveen automation")
optionlist=driver.find_elements(By.CSS_SELECTOR,'ul.erkvQe li span')
print(len(optionlist))
for ele in optionlist:
    print(ele.text)
    if ele.text=='naveen automation labs selenium':
        ele.click()
        break

driver.close()
