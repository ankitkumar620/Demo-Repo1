from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

browser="chrome"
if(browser=="chrome"):
    driver = webdriver.Chrome(ChromeDriverManager().install())
elif (browser=="firefox"):
    driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
else:
    raise "no browser found"