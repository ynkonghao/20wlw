Classroom cla = new Classroom();
cla.setName(request.get("name"));
IClassroomDao dao = new ClassrommDao()
dao.add(cla);