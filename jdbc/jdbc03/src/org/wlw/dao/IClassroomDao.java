package org.wlw.dao;

import org.wlw.models.Classroom;

import java.util.List;

public interface IClassroomDao {
    public void add(Classroom classroom);
    public void update(Classroom classroom);
    public void delete(int id);
    public Classroom load(int id);
    public List<Classroom> find();
}
