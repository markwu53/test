public class Exception {
    public void go() {
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;

        connection = Database.getConnection();

        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        getData(rs);
        rs.close();
        ps.close();

        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        getData(rs);
        rs.close();
        ps.close();

        connection.close();
    }

    public void go2() {
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;

        try {
            connection = Database.getConnection();
            try {
                ps = connection.prepareStatement(sql);
                try {
                    rs = ps.executeQuery();
                    getData(rs);
                    try {
                        rs.close();
                        try {
                            ps.close();
                            try {
                                ps = connection.prepareStatement(sql);
                                try {
                                    rs = ps.executeQuery();
                                    getData(rs);
                                    try {
                                        rs.close();
                                        try {
                                            ps.close();
                                            try {
                                                connection.close();
                                            } catch (Exception e) {
                                            } finally {
                                            }
                                        } catch (Exception e) {
                                        } finally {
                                        }
                                    } catch (Exception e) {
                                    } finally {
                                    }
                                } catch (Exception e) {
                                } finally {
                                    ps.close();
                                }
                            } catch (Exception e) {
                            } finally {
                            }
                        } catch (Exception e) {
                        } finally {
                        }
                    } catch (Exception e) {
                    } finally {
                    }
                } catch (Exception e) {
                } finally {
                    ps.close();
                }
            } catch (Exception e) {
            } finally {
            }
        } catch (Exception e) {
        } finally {
        }
    }

    public void go3() {
        try {
            connection = Database.getConnection();
            try {
                ps = connection.prepareStatement(sql);
                try {
                    rs = ps.executeQuery();
                    getData(rs);
                    rs.close();
                    ps.close();
                    try {
                        ps = connection.prepareStatement(sql);
                        try {
                            rs = ps.executeQuery();
                            getData(rs);
                            rs.close();
                        } catch (Exception e) {
                        } finally {
                        }
                    } catch (Exception e) {
                    } finally {
                    }
                } catch (Exception e) {
                } finally {
                }

        ps.close();

        connection.close();
    }

    public void go4() {
        try {
            connection = Database.getConnection();

            try {
                ps = connection.prepareStatement(sql);
                try {
                    rs = ps.executeQuery();
                    getData(rs);
                    rs.close();
                } finally {
                    ps.close();
                }

                ps = connection.prepareStatement(sql);
                try {
                    rs = ps.executeQuery();
                    getData(rs);
                    rs.close();
                } finally {
                    ps.close();
                }
            } finally {
                connection.close();
            }
        } catch {Exception e} {
        } finally {
            //empty
        }
    }
}
