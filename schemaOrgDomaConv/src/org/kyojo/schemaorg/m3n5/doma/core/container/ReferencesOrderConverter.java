package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REFERENCES_ORDER;
import org.kyojo.schemaorg.m3n5.core.Container.ReferencesOrder;

@ExternalDomain
public class ReferencesOrderConverter implements DomainConverter<ReferencesOrder, String> {

	@Override
	public String fromDomainToValue(ReferencesOrder domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReferencesOrder fromValueToDomain(String value) {
		return new REFERENCES_ORDER(value);
	}

}
