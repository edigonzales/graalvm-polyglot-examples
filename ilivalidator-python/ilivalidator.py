import java
import polyglot
import sys

SettingsJavaClass = java.type('ch.ehi.basics.settings.Settings')
settings = SettingsJavaClass()
ValidatorJavaClass = java.type('org.interlis2.validator.Validator');

settings.setValue(ValidatorJavaClass.SETTING_ILIDIRS, ValidatorJavaClass.SETTING_DEFAULT_ILIDIRS);
logFileName = "ilivalidator.log"
settings.setValue(ValidatorJavaClass.SETTING_LOGFILE, logFileName);

ValidatorJavaClass.runValidation("2457.xtf", settings);

print("Python version")
print (sys.version)
print("Version info.")
print (sys.version_info)
