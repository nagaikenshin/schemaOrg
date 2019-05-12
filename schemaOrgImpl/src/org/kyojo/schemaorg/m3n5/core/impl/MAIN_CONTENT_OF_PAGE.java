package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n5.core.Clazz.Table;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPHeader;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPSideBar;
import org.kyojo.schemaorg.m3n5.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class MAIN_CONTENT_OF_PAGE implements Container.MainContentOfPage {

	private static final long serialVersionUID = 1L;

	public List<SiteNavigationElement> siteNavigationElementList;
	public List<Table> tableList;
	public List<WPAdBlock> wpAdBlockList;
	public List<WPFooter> wpFooterList;
	public List<WPHeader> wpHeaderList;
	public List<WPSideBar> wpSideBarList;
	public List<WebPageElement> webPageElementList;

	public MAIN_CONTENT_OF_PAGE() {
	}

	public MAIN_CONTENT_OF_PAGE(String string) {
		this(new WEB_PAGE_ELEMENT(string));
	}

	public String getString() {
		if(webPageElementList == null || webPageElementList.size() == 0 || webPageElementList.get(0) == null) {
			return null;
		} else {
			Name name = webPageElementList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<WebPageElement>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(new WEB_PAGE_ELEMENT(string));
		} else {
			webPageElementList.set(0, new WEB_PAGE_ELEMENT(string));
		}
	}

	public MAIN_CONTENT_OF_PAGE(SiteNavigationElement siteNavigationElement) {
		siteNavigationElementList = new ArrayList<SiteNavigationElement>();
		siteNavigationElementList.add(siteNavigationElement);
	}

	@Override
	public SiteNavigationElement getSiteNavigationElement() {
		if(siteNavigationElementList != null && siteNavigationElementList.size() > 0) {
			return siteNavigationElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement) {
		if(siteNavigationElementList == null) {
			siteNavigationElementList = new ArrayList<>();
		}
		if(siteNavigationElementList.size() == 0) {
			siteNavigationElementList.add(siteNavigationElement);
		} else {
			siteNavigationElementList.set(0, siteNavigationElement);
		}
	}

	@Override
	public List<SiteNavigationElement> getSiteNavigationElementList() {
		return siteNavigationElementList;
	}

	@Override
	public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList) {
		this.siteNavigationElementList = siteNavigationElementList;
	}

	@Override
	public boolean hasSiteNavigationElement() {
		return siteNavigationElementList != null && siteNavigationElementList.size() > 0 && siteNavigationElementList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(Table table) {
		tableList = new ArrayList<Table>();
		tableList.add(table);
	}

	@Override
	public Table getTable() {
		if(tableList != null && tableList.size() > 0) {
			return tableList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTable(Table table) {
		if(tableList == null) {
			tableList = new ArrayList<>();
		}
		if(tableList.size() == 0) {
			tableList.add(table);
		} else {
			tableList.set(0, table);
		}
	}

	@Override
	public List<Table> getTableList() {
		return tableList;
	}

	@Override
	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	@Override
	public boolean hasTable() {
		return tableList != null && tableList.size() > 0 && tableList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(WPAdBlock wpAdBlock) {
		wpAdBlockList = new ArrayList<WPAdBlock>();
		wpAdBlockList.add(wpAdBlock);
	}

	@Override
	public WPAdBlock getWPAdBlock() {
		if(wpAdBlockList != null && wpAdBlockList.size() > 0) {
			return wpAdBlockList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPAdBlock(WPAdBlock wpAdBlock) {
		if(wpAdBlockList == null) {
			wpAdBlockList = new ArrayList<>();
		}
		if(wpAdBlockList.size() == 0) {
			wpAdBlockList.add(wpAdBlock);
		} else {
			wpAdBlockList.set(0, wpAdBlock);
		}
	}

	@Override
	public List<WPAdBlock> getWPAdBlockList() {
		return wpAdBlockList;
	}

	@Override
	public void setWPAdBlockList(List<WPAdBlock> wpAdBlockList) {
		this.wpAdBlockList = wpAdBlockList;
	}

	@Override
	public boolean hasWPAdBlock() {
		return wpAdBlockList != null && wpAdBlockList.size() > 0 && wpAdBlockList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(WPFooter wpFooter) {
		wpFooterList = new ArrayList<WPFooter>();
		wpFooterList.add(wpFooter);
	}

	@Override
	public WPFooter getWPFooter() {
		if(wpFooterList != null && wpFooterList.size() > 0) {
			return wpFooterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPFooter(WPFooter wpFooter) {
		if(wpFooterList == null) {
			wpFooterList = new ArrayList<>();
		}
		if(wpFooterList.size() == 0) {
			wpFooterList.add(wpFooter);
		} else {
			wpFooterList.set(0, wpFooter);
		}
	}

	@Override
	public List<WPFooter> getWPFooterList() {
		return wpFooterList;
	}

	@Override
	public void setWPFooterList(List<WPFooter> wpFooterList) {
		this.wpFooterList = wpFooterList;
	}

	@Override
	public boolean hasWPFooter() {
		return wpFooterList != null && wpFooterList.size() > 0 && wpFooterList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(WPHeader wpHeader) {
		wpHeaderList = new ArrayList<WPHeader>();
		wpHeaderList.add(wpHeader);
	}

	@Override
	public WPHeader getWPHeader() {
		if(wpHeaderList != null && wpHeaderList.size() > 0) {
			return wpHeaderList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPHeader(WPHeader wpHeader) {
		if(wpHeaderList == null) {
			wpHeaderList = new ArrayList<>();
		}
		if(wpHeaderList.size() == 0) {
			wpHeaderList.add(wpHeader);
		} else {
			wpHeaderList.set(0, wpHeader);
		}
	}

	@Override
	public List<WPHeader> getWPHeaderList() {
		return wpHeaderList;
	}

	@Override
	public void setWPHeaderList(List<WPHeader> wpHeaderList) {
		this.wpHeaderList = wpHeaderList;
	}

	@Override
	public boolean hasWPHeader() {
		return wpHeaderList != null && wpHeaderList.size() > 0 && wpHeaderList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(WPSideBar wpSideBar) {
		wpSideBarList = new ArrayList<WPSideBar>();
		wpSideBarList.add(wpSideBar);
	}

	@Override
	public WPSideBar getWPSideBar() {
		if(wpSideBarList != null && wpSideBarList.size() > 0) {
			return wpSideBarList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPSideBar(WPSideBar wpSideBar) {
		if(wpSideBarList == null) {
			wpSideBarList = new ArrayList<>();
		}
		if(wpSideBarList.size() == 0) {
			wpSideBarList.add(wpSideBar);
		} else {
			wpSideBarList.set(0, wpSideBar);
		}
	}

	@Override
	public List<WPSideBar> getWPSideBarList() {
		return wpSideBarList;
	}

	@Override
	public void setWPSideBarList(List<WPSideBar> wpSideBarList) {
		this.wpSideBarList = wpSideBarList;
	}

	@Override
	public boolean hasWPSideBar() {
		return wpSideBarList != null && wpSideBarList.size() > 0 && wpSideBarList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(WebPageElement webPageElement) {
		webPageElementList = new ArrayList<WebPageElement>();
		webPageElementList.add(webPageElement);
	}

	@Override
	public WebPageElement getWebPageElement() {
		if(webPageElementList != null && webPageElementList.size() > 0) {
			return webPageElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPageElement(WebPageElement webPageElement) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(webPageElement);
		} else {
			webPageElementList.set(0, webPageElement);
		}
	}

	@Override
	public List<WebPageElement> getWebPageElementList() {
		return webPageElementList;
	}

	@Override
	public void setWebPageElementList(List<WebPageElement> webPageElementList) {
		this.webPageElementList = webPageElementList;
	}

	@Override
	public boolean hasWebPageElement() {
		return webPageElementList != null && webPageElementList.size() > 0 && webPageElementList.get(0) != null;
	}

	public MAIN_CONTENT_OF_PAGE(List<SiteNavigationElement> siteNavigationElementList,
			List<Table> tableList,
			List<WPAdBlock> wpAdBlockList,
			List<WPFooter> wpFooterList,
			List<WPHeader> wpHeaderList,
			List<WPSideBar> wpSideBarList,
			List<WebPageElement> webPageElementList) {
		setSiteNavigationElementList(siteNavigationElementList);
		setTableList(tableList);
		setWPAdBlockList(wpAdBlockList);
		setWPFooterList(wpFooterList);
		setWPHeaderList(wpHeaderList);
		setWPSideBarList(wpSideBarList);
		setWebPageElementList(webPageElementList);
	}

	public void copy(Container.MainContentOfPage org) {
		setSiteNavigationElementList(org.getSiteNavigationElementList());
		setTableList(org.getTableList());
		setWPAdBlockList(org.getWPAdBlockList());
		setWPFooterList(org.getWPFooterList());
		setWPHeaderList(org.getWPHeaderList());
		setWPSideBarList(org.getWPSideBarList());
		setWebPageElementList(org.getWebPageElementList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
