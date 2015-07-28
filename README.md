# Dr. Queryalizer
Prepare Queries from Eclipse Debuger Parameters

Ex:

Alter the parameters with your debug result

parameters = "{code=42}"
sql="SELECT EVERYTHING FROM ALL WHERE CODE = :code"

output:
SELECT
      EVERITHING
FROM
    ALL
WHERE
     CODE = '42'
