package org.wlw.mapper;

import org.wlw.model.Classroom;

import java.util.List;

public interface ClassroomMapper {
    public void add(Classroom cla);
    public void update(Classroom cla);
    public Classroom load(int id);
    public List<Classroom> find();
    public void delete(int id);
}
