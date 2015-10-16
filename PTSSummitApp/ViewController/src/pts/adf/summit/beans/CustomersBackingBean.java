package pts.adf.summit.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class CustomersBackingBean {
    private RichPopup popupOrder;

    public CustomersBackingBean() {
    }

    public void setPopupOrder(RichPopup popupOrder) {
        this.popupOrder = popupOrder;
    }

    public RichPopup getPopupOrder() {
        return popupOrder;
    }

    public void createNewOrder(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = (OperationBinding) bindings.getOperationBinding("CreateInsert");
        operationBinding.execute();
        RichPopup.PopupHints ph = new RichPopup.PopupHints();
        ph.add(RichPopup.PopupHints.HintTypes.HINT_ALIGN_ID, "::pb1");
        ph.add(RichPopup.PopupHints.HintTypes.HINT_ALIGN, RichPopup.PopupHints.AlignTypes.ALIGN_OVERLAP);
        popupOrder.show(ph);
    }

    private BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void deleteOrderConfirmation(DialogEvent dialogEvent) {
        // Add event code here...
        //This is the confirmation dialog for deleting an order
        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.yes)) {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = (OperationBinding) bindings.getOperationBinding("Delete");
            operationBinding.execute();
        }
    }
}
