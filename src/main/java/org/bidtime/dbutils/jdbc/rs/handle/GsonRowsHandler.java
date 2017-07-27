package org.bidtime.dbutils.jdbc.rs.handle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.bidtime.dbutils.gson.dataset.GsonRows;
import org.bidtime.dbutils.jdbc.rs.BeanProcessorEx;
import org.bidtime.dbutils.jdbc.rs.handle.ext.ResultSetExHandler;

/**
 * @author jss
 * 
 *         提供对从ResultSet进行预处理的功能,继承ResultSetDTOHandler类
 *
 */
@SuppressWarnings("serial")
public class GsonRowsHandler extends ResultSetExHandler<GsonRows> {

	public GsonRowsHandler() {
		this(false);
	}

	public GsonRowsHandler(boolean countSql) {
		this(new BeanProcessorEx(), false);
	}

	public GsonRowsHandler(BeanProcessorEx convert, boolean countSql) {
		super.setProp(Map.class, convert, countSql);
	}
	
	@Override
	public GsonRows handle(ResultSet rs) throws SQLException {
		return rs.next() ? convert.toGsonRows(rs) : null;
	}

}
