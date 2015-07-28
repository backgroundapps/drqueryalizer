parameters = ""
sql = ""

partes = sql.split('FROM ')
select = partes[0].replace('SELECT ', '')
from   = partes[1].split('WHERE ')[0]
where  = partes[1].split('WHERE ')[1]

selectok = ''
select.split(',').each{ selectok += '      '+it.trim()+'\n' }
fromok = '    '+from.replace('INNER', '\n    INNER').replace('LEFT', '\n    LEFT ')
whereok = '     '+where.replace('AND', '\n     AND')

sqlok = "SELECT \n$selectok \nFROM\n$fromok \nWHERE\n$whereok"
parameters = parameters.replace(' ', '').replace('{', '').replace('}', '').split(',').toList()
parsedsql = sqlok
parameters.each{parsedsql = parsedsql.replace(':'+it.split('=')[0], "'${it.split('=')[1]}'") }
println parsedsql
