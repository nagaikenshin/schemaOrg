package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LISTEN_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ListenAction;

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
