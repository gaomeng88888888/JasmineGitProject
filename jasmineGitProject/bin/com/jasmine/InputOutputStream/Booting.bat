@echo off
::bat文件代替开机启动项
start "WinHotKey" "D:\WinHotKey\WinHotKey.exe"
start "Navicat For MySQL" "C:\Program Files (x86)\Navicat for MySQL\navicat.exe"
start "360wifi" "C:\Program Files (x86)\360\360AP\360AP.exe"
ping localhost -n 2 >nul
start "有道词典" "C:\Users\Administrator\AppData\Local\youdao\dict\Application\YoudaoDict.exe"
ping localhost -n 3 >nul
start "网易邮箱" "C:\Program Files (x86)\Netease\MailMaster\Application\mailmaster.exe"
ping localhost -n 3 >nul
start "SourceTree" "E:\programfiles\sourcetree\SourceTree.exe"
ping localhost -n 5 >nul
start "STS" "D:\sts-bundle\sts-3.7.0.RELEASE\STS.exe"
ping localhost -n 5 >nul
start "微信" "D:\WeChat\WeChat.exe"
ping localhost -n 5 >nul
start "QQ" "C:\Program Files (x86)\Tencent\QQ\Bin\QQScLauncher.exe"