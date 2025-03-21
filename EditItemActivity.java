item = item_list_controller.getItem(pos);
            item_controller = new ItemController(item);

            Contact contact = item_controller.getBorrower();
            if (contact != null){
                int contact_pos = contact_list_controller.getIndex(contact);
                borrower_spinner.setSelection(contact_pos);
            }

            title.setText(item_controller.getTitle());
            maker.setText(item_controller.getMaker());
            description.setText(item_controller.getDescription());

            length.setText(item_controller.getLength());
            width.setText(item_controller.getWidth());
            height.setText(item_controller.getHeight());

            String status_str = item_controller.getStatus();
            if (status_str.equals("Borrowed")) {
                status.setChecked(false);
            } else {
                borrower_tv.setVisibility(View.GONE);
                borrower_spinner.setVisibility(View.GONE);
            }

            image = item_controller.getImage();
            if (image != null) {
                photo.setImageBitmap(image);
            } else {
                photo.setImageResource(android.R.drawable.ic_menu_gallery);
            }
        }
    }
}
