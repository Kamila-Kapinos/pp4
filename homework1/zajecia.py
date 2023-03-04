class Zajecia():
    
    def __init__(self):
        self.students = []
    
    
    def addStudent(self, newStudent):
        if len(self.students) < 10:
            self.students.append(newStudent)
            return True
        else:
            return False

z = Zajecia()
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
z.addStudent("Basia")
z.addStudent("Kasia")
print(z.addStudent("Basia")
)



