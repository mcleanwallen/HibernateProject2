package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Myclasses {
    private int myClassId;
    private String className;
    private String classSubject;
    private int classCode;
    private String classProfessor;

    @Id
    @Column(name = "myClassId")
    public int getMyClassId() {
        return myClassId;
    }

    public void setMyClassId(int myClassId) {
        this.myClassId = myClassId;
    }

    @Basic
    @Column(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "classSubject")
    public String getClassSubject() {
        return classSubject;
    }

    public void setClassSubject(String classSubject) {
        this.classSubject = classSubject;
    }

    @Basic
    @Column(name = "classCode")
    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "classProfessor")
    public String getClassProfessor() {
        return classProfessor;
    }

    public void setClassProfessor(String classProfessor) {
        this.classProfessor = classProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Myclasses myclasses = (Myclasses) o;

        if (myClassId != myclasses.myClassId) return false;
        if (classCode != myclasses.classCode) return false;
        if (className != null ? !className.equals(myclasses.className) : myclasses.className != null) return false;
        if (classSubject != null ? !classSubject.equals(myclasses.classSubject) : myclasses.classSubject != null)
            return false;
        if (classProfessor != null ? !classProfessor.equals(myclasses.classProfessor) : myclasses.classProfessor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = myClassId;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (classSubject != null ? classSubject.hashCode() : 0);
        result = 31 * result + classCode;
        result = 31 * result + (classProfessor != null ? classProfessor.hashCode() : 0);
        return result;
    }
}
