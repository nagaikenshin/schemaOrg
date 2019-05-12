package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MAIN_CONTENT_OF_PAGE;
import org.kyojo.schemaorg.m3n5.core.Container.MainContentOfPage;

@ExternalDomain
public class MainContentOfPageConverter implements DomainConverter<MainContentOfPage, String> {

	@Override
	public String fromDomainToValue(MainContentOfPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public MainContentOfPage fromValueToDomain(String value) {
		return new MAIN_CONTENT_OF_PAGE(value);
	}

}
