a = ['a', 'b', 'c']
b = []
for l1 in a:
  for l2 in a:
    for l3 in a:
      print(l1 + l2 + l3)
      if(l1 == l2 or l1 == l3 or l2 == l3):
        continue
      b.append(l1+l2+l3)
print(b)