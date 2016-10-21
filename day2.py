
sqft = 0

with open("./input2.txt") as f:
	for line in f:
		split = line.split("x")
		x = int(split[0])
		y = int(split[1])
		z = int(split[2])
		xy = x*y
		xz = x*z
		yz = y*z
		shortest = min(xy, xz, yz)
		sqft += 2*x*y + 2*x*z + 2*y*z + shortest

print("total square feet: " + str(sqft))
