package tw.ninniku.timeline;

import java.sql.Timestamp;

public class Item {

	
	/*
	 * start: new Date(2010, 7, 15),
    end: new Date(2010, 8, 2),  // end is optional
    content: 'Trajectory A'
	 */
	String documentNo;
	String group;
	Timestamp start;
	Timestamp end;
	String name;
	String description;
	String content;
	String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getS_booking_id() {
		return s_booking_id;
	}
	public void setS_booking_id(String s_booking_id) {
		this.s_booking_id = s_booking_id;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setS_resource_id(String s_resource_id) {
		this.s_resource_id = s_resource_id;
	}
	String s_resource_id;
	String s_booking_id;
	String className;
    String align;
	String style;
    String subgroup;
    String title;
    String type; 
    boolean limitSize =  false;
    boolean editable = false;
	public Item(int s_Booking_ID) {
		// TODO Auto-generated constructor stub
		setId(s_Booking_ID);
		setS_booking_id(String.valueOf(s_Booking_ID));
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isLimitSize() {
		return limitSize;
	}
	public void setLimitSize(boolean limitSize) {
		this.limitSize = limitSize;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public String getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = String.valueOf(group) ;
	}
	public Timestamp getStart() {
		return start;
	}
	public void setStart(Timestamp start) {
		this.start = start;
	}
	public Timestamp getEnd() {
		return end;
	}
	public void setEnd(Timestamp end) {
		this.end = end;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(int id) {
		this.id = String.valueOf(id);
	}
	public String getS_resource_id() {
		return s_resource_id;
	}
	public void setS_resource_id(int s_resource_id) {
		this.s_resource_id = String.valueOf(s_resource_id) ;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getAlign() {
		return align;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSubgroup() {
		return subgroup;
	}
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

    
    
}
