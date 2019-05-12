package org.kyojo.schemaorg.m3n5.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.itemAvailability.PRE_ORDER;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.PreOrder;

@ExternalDomain
public class PreOrderConverter implements DomainConverter<PreOrder, String> {

	@Override
	public String fromDomainToValue(PreOrder domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreOrder fromValueToDomain(String value) {
		return new PRE_ORDER(value);
	}

}
