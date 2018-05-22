package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIEW_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ViewAction;

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
