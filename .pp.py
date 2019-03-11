import sys

#print(sys.argv)
tree = sys.argv[1]

tabs = ''
for char in tree:
    if char is '\n':
        continue
    if char is '(':
        tabs += '\t'
        print('\n',tabs, end='')

    print(char, end='')

    if char is ')':
        tabs = tabs[0:len(tabs)-1]
        print('\n',tabs, end='')
