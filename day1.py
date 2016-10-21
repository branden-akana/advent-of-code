
f = open('./input1.txt', 'r')

floor = 0
position = 0
enteredBasement = False
basement = 0

for c in f.read():
    position += 1
    if c == '(':
        floor += 1
    elif c == ')':
        floor -= 1
    if floor == -1 and not enteredBasement:
        enteredBasement = True
        basement = position

print(str(floor) + '\n' + 'entered basement at: ' + str(basement))
