package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VIEW_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ViewAction;

@ExternalDomain
public class ViewActionConverter implements DomainConverter<ViewAction, String> {

	@Override
	public String fromDomainToValue(ViewAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ViewAction fromValueToDomain(String value) {
		return new VIEW_ACTION(value);
	}

}
