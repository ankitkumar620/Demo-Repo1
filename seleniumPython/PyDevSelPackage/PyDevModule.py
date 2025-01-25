'''
Created on 23-Aug-2021

@author: Ank
'''
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait

driver=webdriver.Chrome('C:/Users/Ank/Downloads/chromedriver_win32/chromedriver.exe')
driver.get("https://www.hdfcbank.com/")
wait = WebDriverWait(driver, 10)
driver.maximize_window()
print(driver.title)
print(driver.current_url)
driver.implicitly_wait(5)
#driver.switch_to_alert().accept()
#driver.find_element_by_class_name("popupCloseButton").click()

loginButton=driver.find_element_by_xpath("(//button[text()='Login'])[2]")
loginButton.click()
element = wait.until(EC.presence_of_element_located((By.XPATH, "(//a[text()='Login'])[1]")))

login=driver.find_element_by_xpath("(//a[text()='Login'])[1]")
login.click()

elContinue=driver.find_element_by_xpath("(//a[contains(text(),'CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING')])[2]")
print(elContinue.get_attribute('href'))
elContinue.click()

driver.find_element_by_name("fldLoginUserId").send_keys("1234")

driver.close()
