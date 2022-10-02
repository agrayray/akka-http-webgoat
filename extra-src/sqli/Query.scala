package sqli

import java.sql.DriverManager
import java.sql.Connection

object Query {

  def run(userid: String, passwd: String) {
    // connect to the database named "mysql" on the localhost
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/mysql"
    val username = "root"
    val password = "root"

    // there's probably a better way to do this
    var connection: Connection = null

    try {
      // make the connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val sql = "SELECT * FROM users WHERE username = '" + userid + "' AND password = '" + passwd + "'"
      val resultSet = statement.executeQuery(sql)
      while (resultSet.next()) {
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")
        println("host, user = " + host + ", " + user)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }

}
