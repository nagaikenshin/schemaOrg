package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LISTEN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ListenAction;

@ExternalDomain
public class ListenActionConverter implements DomainConverter<ListenAction, String> {

	@Override
	public String fromDomainToValue(ListenAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ListenAction fromValueToDomain(String value) {
		return new LISTEN_ACTION(value);
	}

}
