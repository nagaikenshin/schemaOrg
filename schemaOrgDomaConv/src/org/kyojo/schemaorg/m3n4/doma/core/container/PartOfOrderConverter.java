package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PART_OF_ORDER;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfOrder;

@ExternalDomain
public class PartOfOrderConverter implements DomainConverter<PartOfOrder, String> {

	@Override
	public String fromDomainToValue(PartOfOrder domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfOrder fromValueToDomain(String value) {
		return new PART_OF_ORDER(value);
	}

}
